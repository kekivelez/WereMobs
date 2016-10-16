package WereMobs.entity;

import WereMobs.ai.EntityAIWeirdZombieAttack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Elemental on 10/16/2016.
 */
public class EntityWerewolf extends EntityMob{


    public EntityWerewolf(World worldIn) {

        super(worldIn);
        setSize(0.6F, 1.95F);

    }

    @Override

    protected void entityInit() {

        super.entityInit();

    }


    public void onLivingUpdate()
    {
        if (this.worldObj.isDaytime() && !this.worldObj.isRemote){
            float f = this.getBrightness(1.0F);
            BlockPos blockpos = this.getRidingEntity() instanceof EntityBoat ? (new BlockPos(this.posX, (double)Math.round(this.posY), this.posZ)).up() : new BlockPos(this.posX, (double)Math.round(this.posY), this.posZ);

            if (f > 0.5F && this.rand.nextFloat() * 30.0F < (f - 0.4F) * 2.0F && this.worldObj.canSeeSky(blockpos))
            {
                this.convertToVillager();
            }
    }
        super.onLivingUpdate();
    }

    protected void convertToVillager()
    {
        EntityVillager entityvillager = new EntityVillager(this.worldObj);
        entityvillager.copyLocationAndAnglesFrom(this);
        entityvillager.onInitialSpawn(this.worldObj.getDifficultyForLocation(new BlockPos(entityvillager)), (IEntityLivingData)null);
        entityvillager.setLookingForHome();

        this.worldObj.removeEntity(this);
        //entityvillager.setNoAI(this.isAIDisabled());


        if (this.hasCustomName())
        {
            entityvillager.setCustomNameTag(this.getCustomNameTag());
            entityvillager.setAlwaysRenderNameTag(this.getAlwaysRenderNameTag());
        }

        this.worldObj.spawnEntityInWorld(entityvillager);
        entityvillager.addPotionEffect(new PotionEffect(MobEffects.GLOWING, 2000000, 0));
        this.worldObj.playEvent((EntityPlayer)null, 1027, new BlockPos((int)this.posX, (int)this.posY, (int)this.posZ), 0);
    }


    @Override

    protected void applyEntityAttributes() {

        super.applyEntityAttributes();
        // Here we set various attributes for our mob. Like maximum health, armor, speed, ...
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.6D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0D);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(5.0D);

    }

    @Override
    protected void initEntityAI() {

        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackMelee(this, 0.7D, true));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 0.7D));
        this.tasks.addTask(7, new EntityAIWander(this, 0.6D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 28.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.applyEntityAI();

    }



    private void applyEntityAI() {

        this.tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, false));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[]{EntityPigZombie.class}));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityVillager.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityIronGolem.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityPig.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityWerewolf.class, true));


    }



    @Override

    public boolean attackEntityAsMob(Entity entityIn) {

        if (super.attackEntityAsMob(entityIn)) {

            if (entityIn instanceof EntityLivingBase) {

                // This zombie gives health boost and regeneration when it attacksv

                ((EntityLivingBase)entityIn).addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, 25));

                ((EntityLivingBase)entityIn).addPotionEffect(new PotionEffect(MobEffects.GLOWING, 55));
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected boolean isValidLightLevel() {
        return true;
    }

    @Override
    public int getMaxSpawnedInChunk() {
        return 4;
    }






}
