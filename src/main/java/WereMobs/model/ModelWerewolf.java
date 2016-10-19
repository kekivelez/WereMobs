package WereMobs.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Created by Elemental on 10/16/2016.
 */
public class ModelWerewolf extends ModelBase {
//fields
    ModelRenderer RFoot;
    ModelRenderer LFoot;

    ModelRenderer Waist_4;
    ModelRenderer Waist_3_;
    ModelRenderer Waist_2;
    ModelRenderer Waist_1;
    ModelRenderer Chest_;
    ModelRenderer Head;
    ModelRenderer RArm;
    ModelRenderer LArm;
    ModelRenderer RPalm;
    ModelRenderer LPalm;
    ModelRenderer RFingers;
    ModelRenderer LFingers;
    ModelRenderer Trap_L;
    ModelRenderer Trap_R;
    ModelRenderer Small_Hunch;
    ModelRenderer BIg_Hunch;
    ModelRenderer Hunch_2_;
    ModelRenderer Hunch_3;
    ModelRenderer Hunch_1;
    ModelRenderer Hunch_4;
    ModelRenderer Tail_1;
    ModelRenderer Tail_2;
    ModelRenderer Tail_3;
    ModelRenderer Tail_4;
    ModelRenderer Tail_5;
    ModelRenderer Tail_7;
    ModelRenderer Tail_8;
    ModelRenderer LEar;
    ModelRenderer REar;
    ModelRenderer Mouth;
    ModelRenderer Tail_6;
  

    public ModelWerewolf()
    
    	  {
    		    textureWidth = 512;
    		    textureHeight = 256;
    		    
    		      RFoot = new ModelRenderer(this, 85, 240);
    		      RFoot.addBox(-4F, 0F, -15F, 7, 2, 12);
    		      RFoot.setRotationPoint(-4F, 22F, 11F);
    		      RFoot.setTextureOffset(115, 215).addBox(-4F, -12F, -9F, 7, 12, 6);
    		      setRotation(RFoot, 0F, 0F, 0F);
    		      
    		      LFoot = new ModelRenderer(this, 134, 239);
    		      LFoot.addBox(-3F, 0F, -16F, 7, 2, 12);
    		      LFoot.setRotationPoint(4F, 22F, 12F);
    		      LFoot.setTextureOffset(115, 215).addBox(-3F, -12F, -10F, 7, 12, 6);
    		      setRotation(LFoot, 0F, 0F, 0F);
    		      
    		      
    		      Waist_4 = new ModelRenderer(this, 115, 204);
    		      Waist_4.addBox(-6F, 0F, -3F, 12, 2, 6);
    		      Waist_4.setRotationPoint(0F, 8F, 5F);
    		      Waist_4.setTextureSize(64, 32);
    		      Waist_4.mirror = true;
    		      setRotation(Waist_4, 0F, 0F, 0F);
    		      Waist_3_ = new ModelRenderer(this, 115, 193);
    		      Waist_3_.addBox(-5F, 0F, -3F, 10, 1, 6);
    		      Waist_3_.setRotationPoint(0F, 7F, 5F);
    		      Waist_3_.setTextureSize(64, 32);
    		      Waist_3_.mirror = true;
    		      setRotation(Waist_3_, 0F, 0F, 0F);
    		      Waist_2 = new ModelRenderer(this, 115, 181);
    		      Waist_2.addBox(-4F, 0F, -3F, 8, 2, 6);
    		      Waist_2.setRotationPoint(0F, 6F, 5F);
    		      Waist_2.setTextureSize(64, 32);
    		      Waist_2.mirror = true;
    		      setRotation(Waist_2, 0.1745329F, 0F, 0F);
    		      Waist_1 = new ModelRenderer(this, 115, 168);
    		      Waist_1.addBox(-5F, 0F, -3F, 10, 2, 6);
    		      Waist_1.setRotationPoint(0F, 4F, 5F);
    		      Waist_1.setTextureSize(64, 32);
    		      Waist_1.mirror = true;
    		      setRotation(Waist_1, 0.2094395F, 0F, 0F);
    		      Chest_ = new ModelRenderer(this, 115, 140);
    		      Chest_.addBox(-8F, 1F, 0F, 16, 12, 8);
    		      Chest_.setRotationPoint(0F, -8F, -1F);
    		      Chest_.setTextureSize(64, 32);
    		      Chest_.mirror = true;
    		      setRotation(Chest_, 0.2443461F, 0F, 0F);
    		      Head = new ModelRenderer(this, 115, 100);
    		      Head.addBox(-2.5F, -5F, -2.5F, 8, 8, 8);
    		      Head.setRotationPoint(-1F, -10F, 2F);
    		      Head.setTextureSize(64, 32);
    		      Head.mirror = true;
    		      setRotation(Head, 0.2792527F, 0F, 0F);
    		      RArm = new ModelRenderer(this, 90, 190);
    		      RArm.addBox(-4F, -1F, -2F, 4, 16, 6);
    		      RArm.setRotationPoint(-8F, -9F, 2F);
    		      RArm.setTextureSize(64, 32);
    		      RArm.mirror = true;
    		      setRotation(RArm, -0.185895F, 0F, 0F);
    		      LArm = new ModelRenderer(this, 90, 190);
    		      LArm.addBox(0F, -1F, -2F, 4, 16, 6);
    		      LArm.setRotationPoint(8F, -9F, 2F);
    		      LArm.setTextureSize(64, 32);
    		      LArm.mirror = true;
    		      setRotation(LArm, -0.185895F, 0F, 0F);
    		      RPalm = new ModelRenderer(this, 70, 190);
    		      RPalm.addBox(-1F, 0F, -1F, 3, 2, 2);
    		      RPalm.setRotationPoint(-10F, 5.75F, -1F);
    		      RPalm.setTextureSize(64, 32);
    		      RPalm.mirror = true;
    		      setRotation(RPalm, -0.185895F, 0F, 0F);
    		      LPalm = new ModelRenderer(this, 70, 190);
    		      LPalm.addBox(-1F, 0F, -1F, 3, 2, 2);
    		      LPalm.setRotationPoint(9F, 5.75F, -1F);
    		      LPalm.setTextureSize(64, 32);
    		      LPalm.mirror = true;
    		      setRotation(LPalm, -0.185895F, 0F, 0F);
    		      RFingers = new ModelRenderer(this, 70, 210);
    		      RFingers.addBox(-1F, 0F, -1F, 3, 2, 1);
    		      RFingers.setRotationPoint(-10F, 7F, -1.25F);
    		      RFingers.setTextureSize(64, 32);
    		      RFingers.mirror = true;
    		      setRotation(RFingers, -0.185895F, 0F, 0F);
    		      LFingers = new ModelRenderer(this, 50, 210);
    		      LFingers.addBox(-1F, 0F, -1F, 3, 2, 1);
    		      LFingers.setRotationPoint(9F, 7F, -1.25F);
    		      LFingers.setTextureSize(64, 32);
    		      LFingers.mirror = true;
    		      setRotation(LFingers, -0.185895F, 0F, 0F);
    		      Trap_L = new ModelRenderer(this, 200, 150);
    		      Trap_L.addBox(0F, -3.833333F, -3F, 8, 6, 4);
    		      Trap_L.setRotationPoint(2F, -8F, 6F);
    		      Trap_L.setTextureSize(64, 32);
    		      Trap_L.mirror = true;
    		      setRotation(Trap_L, 0.2443461F, 0F, 0F);
    		      Trap_R = new ModelRenderer(this, 200, 150);
    		      Trap_R.addBox(-6F, -4F, -3F, 8, 6, 4);
    		      Trap_R.setRotationPoint(-4F, -8F, 6F);
    		      Trap_R.setTextureSize(64, 32);
    		      Trap_R.mirror = true;
    		      setRotation(Trap_R, 0.2443461F, 0F, 0F);
    		      Small_Hunch = new ModelRenderer(this, 200, 125);
    		      Small_Hunch.addBox(-7F, -2F, 0F, 14, 3, 6);
    		      Small_Hunch.setRotationPoint(0F, -12F, 4.5F);
    		      Small_Hunch.setTextureSize(64, 32);
    		      Small_Hunch.mirror = true;
    		      setRotation(Small_Hunch, 0.2792527F, 0F, 0F);
    		      BIg_Hunch = new ModelRenderer(this, 200, 90);
    		      BIg_Hunch.addBox(-7F, -2F, 0F, 16, 8, 6);
    		      BIg_Hunch.setRotationPoint(-1F, -10F, 6F);
    		      BIg_Hunch.setTextureSize(64, 32);
    		      BIg_Hunch.mirror = true;
    		      setRotation(BIg_Hunch, 0.2443461F, 0F, 0F);
    		      Hunch_2_ = new ModelRenderer(this, 200, 65);
    		      Hunch_2_.addBox(-6F, -1F, 0F, 14, 2, 5);
    		      Hunch_2_.setRotationPoint(-1F, -2F, 8F);
    		      Hunch_2_.setTextureSize(64, 32);
    		      Hunch_2_.mirror = true;
    		      setRotation(Hunch_2_, 0F, 0F, 0F);
    		      Hunch_3 = new ModelRenderer(this, 200, 50);
    		      Hunch_3.addBox(-7F, -1F, 0F, 12, 2, 4);
    		      Hunch_3.setRotationPoint(1F, -1F, 9F);
    		      Hunch_3.setTextureSize(64, 32);
    		      Hunch_3.mirror = true;
    		      setRotation(Hunch_3, -0.2443461F, 0F, 0F);
    		      Hunch_1 = new ModelRenderer(this, 200, 75);
    		      Hunch_1.addBox(-6F, -1F, 0F, 14, 3, 5);
    		      Hunch_1.setRotationPoint(-1F, -3F, 8F);
    		      Hunch_1.setTextureSize(64, 32);
    		      Hunch_1.mirror = true;
    		      setRotation(Hunch_1, 0.2443461F, 0F, 0F);
    		      Hunch_4 = new ModelRenderer(this, 250, 140);
    		      Hunch_4.addBox(-6F, -1F, 0F, 8, 2, 2);
    		      Hunch_4.setRotationPoint(2F, 1F, 9F);
    		      Hunch_4.setTextureSize(64, 32);
    		      Hunch_4.mirror = true;
    		      setRotation(Hunch_4, 0.1047198F, 0F, 0F);
    		      Tail_1 = new ModelRenderer(this, 250, 200);
    		      Tail_1.addBox(-5F, -1F, 1F, 10, 2, 2);
    		      Tail_1.setRotationPoint(0F, 7F, 7F);
    		      Tail_1.setTextureSize(64, 32);
    		      Tail_1.mirror = true;
    		      setRotation(Tail_1, 0.3490659F, 0F, 0F);
    		      Tail_2 = new ModelRenderer(this, 250, 215);
    		      Tail_2.addBox(-6F, -1F, 0F, 12, 3, 2);
    		      Tail_2.setRotationPoint(0F, 8F, 9F);
    		      Tail_2.setTextureSize(64, 32);
    		      Tail_2.mirror = true;
    		      setRotation(Tail_2, 0.7679449F, 0F, 0F);
    		      Tail_3 = new ModelRenderer(this, 250, 225);
    		      Tail_3.addBox(-7F, 0F, 0F, 14, 6, 2);
    		      Tail_3.setRotationPoint(0F, 9.5F, 10.5F);
    		      Tail_3.setTextureSize(64, 32);
    		      Tail_3.mirror = true;
    		      setRotation(Tail_3, 0.8726646F, 0F, 0F);
    		      Tail_4 = new ModelRenderer(this, 250, 235);
    		      Tail_4.addBox(-7F, 0F, -1F, 12, 3, 2);
    		      Tail_4.setRotationPoint(1F, 12F, 15F);
    		      Tail_4.setTextureSize(64, 32);
    		      Tail_4.mirror = true;
    		      setRotation(Tail_4, 1.22173F, 0F, 0F);
    		      Tail_5 = new ModelRenderer(this, 250, 245);
    		      Tail_5.addBox(-5F, 0F, -1F, 10, 2, 2);
    		      Tail_5.setRotationPoint(0F, 13F, 17F);
    		      Tail_5.setTextureSize(64, 32);
    		      Tail_5.mirror = true;
    		      setRotation(Tail_5, 1.574287F, 0F, 0F);
    		      Tail_7 = new ModelRenderer(this, 250, 170);
    		      Tail_7.addBox(-1F, 0F, -1F, 4, 2, 2);
    		      Tail_7.setRotationPoint(-1F, 13F, 20F);
    		      Tail_7.setTextureSize(64, 32);
    		      Tail_7.mirror = true;
    		      setRotation(Tail_7, 2.242748F, 0F, 0F);
    		      Tail_8 = new ModelRenderer(this, 250, 160);
    		      Tail_8.addBox(-1F, 0F, 0F, 2, 2, 2);
    		      Tail_8.setRotationPoint(0F, 13F, 22F);
    		      Tail_8.setTextureSize(64, 32);
    		      Tail_8.mirror = true;
    		      setRotation(Tail_8, 2.513274F, 0F, 0F);
    		      LEar = new ModelRenderer(this, 100, 100);
    		      LEar.addBox(-1F, -2F, -1F, 2, 3, 2);
    		      LEar.setRotationPoint(3.5F, -15.46667F, 0F);
    		      LEar.setTextureSize(64, 32);
    		      LEar.mirror = true;
    		      setRotation(LEar, 0.2792527F, 0F, 0F);
    		      REar = new ModelRenderer(this, 80, 100);
    		      REar.addBox(-1F, -2F, -1F, 2, 3, 2);
    		      REar.setRotationPoint(-2.5F, -15.3F, 0F);
    		      REar.setTextureSize(64, 32);
    		      REar.mirror = true;
    		      setRotation(REar, 0.2792527F, 0F, 0F);
    		      Mouth = new ModelRenderer(this, 85, 115);
    		      Mouth.addBox(-1.5F, -1F, -2.5F, 3, 2, 3);
    		      Mouth.setRotationPoint(0F, -9.8F, -1F);
    		      Mouth.setTextureSize(64, 32);
    		      Mouth.mirror = true;
    		      setRotation(Mouth, 0.2792527F, 0F, 0F);
    		      Tail_6 = new ModelRenderer(this, 250, 180);
    		      Tail_6.addBox(-5F, 0F, -1F, 8, 2, 2);
    		      Tail_6.setRotationPoint(1F, 13F, 19F);
    		      Tail_6.setTextureSize(64, 32);
    		      Tail_6.mirror = true;
    		      setRotation(Tail_6, 1.780236F, 0F, 0F);
    		  }
    		  

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5,entity);
        RFoot.render(f5);
        LFoot.render(f5);
        Waist_4.render(f5);
        Waist_3_.render(f5);
        Waist_2.render(f5);
        Waist_1.render(f5);
        Chest_.render(f5);
        Head.render(f5);
        RArm.render(f5);
        LArm.render(f5);
        RPalm.render(f5);
        LPalm.render(f5);
        RFingers.render(f5);
        LFingers.render(f5);
        Trap_L.render(f5);
        Trap_R.render(f5);
        Small_Hunch.render(f5);
        BIg_Hunch.render(f5);
        Hunch_2_.render(f5);
        Hunch_3.render(f5);
        Hunch_1.render(f5);
        Hunch_4.render(f5);
        Tail_1.render(f5);
        Tail_2.render(f5);
        Tail_3.render(f5);
        Tail_4.render(f5);
        Tail_5.render(f5);
        Tail_7.render(f5);
        Tail_8.render(f5);
        LEar.render(f5);
        REar.render(f5);
        Mouth.render(f5);
        Tail_6.render(f5);

    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5,Entity entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5,entity);

        this.LFoot.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1 / 1.0F;
        this.RFoot.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1 / 1.0F;

    }



}
