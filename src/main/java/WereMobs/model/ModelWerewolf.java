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
    ModelRenderer Head;
    ModelRenderer Body;
    ModelRenderer Waist_1_;
    ModelRenderer Waist_2_;
    ModelRenderer Waist_3_;
    ModelRenderer Waist_4_;
    ModelRenderer Tail_4;
    ModelRenderer Tail_3;
    ModelRenderer tail_3;
    ModelRenderer Tail_1;
    ModelRenderer Tail_5;
    ModelRenderer Tail_6;
    ModelRenderer Tail_7_;
    ModelRenderer Tail_8_;
    ModelRenderer Hunch;
    ModelRenderer Chest;
    ModelRenderer Hunch_2;
    ModelRenderer Trap_L;
    ModelRenderer Trap_R;
    ModelRenderer Mini_Hunch;
    ModelRenderer Hocico;
    ModelRenderer Rear;
    ModelRenderer Lear;
    ModelRenderer LPalm;
    ModelRenderer Rpalm;
    ModelRenderer Rthumb;
    ModelRenderer Lthumb;
    ModelRenderer HandL;
    ModelRenderer HandR;

    ModelRenderer Arm_R;
    ModelRenderer Arm_L;

    ModelRenderer LLeg;
    ModelRenderer RLeg;

    public ModelWerewolf()
    {
        textureWidth = 512;
        textureHeight = 256;

        Head = new ModelRenderer(this, 123, 16);
        Head.addBox(0F, 0F, 0F, 16, 16, 16);
        Head.setRotationPoint(5F, -70F, -5F);
        setRotation(Head, 0F, 0F, 0.074351F);

        Hocico = new ModelRenderer(this, 140, 0);
        Hocico.addBox(0F, 0F, 0F, 7, 6, 6);
        Hocico.setRotationPoint(21F, -62F, 0F);
        Hocico.setTextureSize(512, 256);
        Hocico.mirror = true;
        setRotation(Hocico, 0F, 0F, 0.074351F);

        Rear = new ModelRenderer(this, 0, 0);
        Rear.addBox(0F, 0F, 0F, 7, 6, 6);
        Rear.setRotationPoint(11.76667F, -75F, -5F);
        Rear.setTextureSize(512, 256);
        Rear.mirror = true;
        setRotation(Rear, 0F, 0F, 0.0568977F);

        Lear = new ModelRenderer(this, 0, 0);
        Lear.addBox(0F, 0F, 0F, 7, 6, 6);
        Lear.setRotationPoint(12F, -75F, 5F);
        Lear.setTextureSize(512, 256);
        Lear.mirror = true;
        setRotation(Lear, 0F, 0F, 0.074351F);

        Body = new ModelRenderer(this, 102, 204);
        Body.addBox(0F, 0F, 0F, 16, 20, 32);
        Body.setRotationPoint(4F, -54F, -12F);
        setRotation(Body, 0F, 0F, 0.074351F);

        Waist_1_ = new ModelRenderer(this, 0, 79);
        Waist_1_.addBox(0F, 0F, 0F, 26, 4, 24);
        Waist_1_.setRotationPoint(-8F, -35F, -8F);
        Waist_1_.setTextureSize(512, 256);
        Waist_1_.mirror = true;
        setRotation(Waist_1_, 0F, 0F, 0.074351F);

        Waist_2_ = new ModelRenderer(this, 0, 108);
        Waist_2_.addBox(0F, 0F, 0F, 16, 6, 20);
        Waist_2_.setRotationPoint(1F, -30F, -6F);
        Waist_2_.setTextureSize(512, 256);
        Waist_2_.mirror = true;
        setRotation(Waist_2_, 0F, 0F, 0.0743572F);

        Waist_3_ = new ModelRenderer(this, 0, 134);
        Waist_3_.addBox(0F, 0F, 0F, 16, 2, 18);
        Waist_3_.setRotationPoint(0F, -23F, -5F);
        Waist_3_.setTextureSize(512, 256);
        Waist_3_.mirror = true;
        setRotation(Waist_3_, 0F, 0F, 0F);

        Waist_4_ = new ModelRenderer(this, 0, 155);
        Waist_4_.addBox(0F, 0F, 0F, 16, 4, 26);
        Waist_4_.setRotationPoint(0F, -21F, -9F);
        Waist_4_.setTextureSize(512, 256);
        Waist_4_.mirror = true;
        setRotation(Waist_4_, 0F, 0F, 0F);

        Tail_4 = new ModelRenderer(this, 300, 0);
        Tail_4.addBox(-8F, 0F, -1F, 8, 4, 20);
        Tail_4.setRotationPoint(-5F, 7F, -5F);
        Tail_4.setTextureSize(512, 256);
        Tail_4.mirror = true;
        setRotation(Tail_4, 0F, 0F, 0.418879F);
        Tail_3 = new ModelRenderer(this, 300, 56);
        Tail_3.addBox(0F, 0F, 0F, 8, 12, 28);
        Tail_3.setRotationPoint(-8F, -10F, -10F);
        Tail_3.setTextureSize(512, 256);
        Tail_3.mirror = true;
        setRotation(Tail_3, 0F, 0F, 0.2792527F);
        tail_3 = new ModelRenderer(this, 300, 25);
        tail_3.addBox(0F, 0F, 0F, 8, 6, 24);
        tail_3.setRotationPoint(-8F, -13F, -8F);
        tail_3.setTextureSize(512, 256);
        tail_3.mirror = true;
        setRotation(tail_3, 0F, 0F, -0.0523599F);
        Tail_1 = new ModelRenderer(this, 300, 0);
        Tail_1.addBox(0F, 0F, 0F, 8, 4, 20);
        Tail_1.setRotationPoint(-8F, -17F, -6F);
        Tail_1.setTextureSize(512, 256);
        Tail_1.mirror = true;
        setRotation(Tail_1, 0F, 0F, 0F);
        Tail_5 = new ModelRenderer(this, 300, 97);
        Tail_5.addBox(0F, 0F, 0F, 8, 4, 25);
        Tail_5.setRotationPoint(-11F, 1F, -8F);
        Tail_5.setTextureSize(512, 256);
        Tail_5.mirror = true;
        setRotation(Tail_5, 0F, 0F, 0.3839724F);
        Tail_6 = new ModelRenderer(this, 300, 126);
        Tail_6.addBox(0F, 0F, 0F, 8, 4, 16);
        Tail_6.setRotationPoint(-13F, 6F, -4F);
        Tail_6.setTextureSize(512, 256);
        Tail_6.mirror = true;
        setRotation(Tail_6, 0F, 0F, 0.5585054F);
        Tail_7_ = new ModelRenderer(this, 300, 147);
        Tail_7_.addBox(0F, 0F, 0F, 8, 4, 10);
        Tail_7_.setRotationPoint(-13F, 7F, -1F);
        Tail_7_.setTextureSize(512, 256);
        Tail_7_.mirror = true;
        setRotation(Tail_7_, 0F, 0F, 0.837758F);
        Tail_8_ = new ModelRenderer(this, 300, 162);
        Tail_8_.addBox(0F, 0F, 0F, 6, 4, 6);
        Tail_8_.setRotationPoint(-12F, 9F, 1F);
        Tail_8_.setTextureSize(512, 256);
        Tail_8_.mirror = true;
        setRotation(Tail_8_, 0F, 0F, 1.134464F);

        Hunch = new ModelRenderer(this, 102, 90);
        Hunch.addBox(0F, 0F, 0F, 16, 22, 32);
        Hunch.setRotationPoint(-11F, -63F, -12F);
        Hunch.setTextureSize(512, 256);
        Hunch.mirror = true;
        setRotation(Hunch, 0F, 0F, 0.074351F);

        Chest = new ModelRenderer(this, 0, 40);
        Chest.addBox(0F, 0F, 0F, 12, 6, 32);
        Chest.setRotationPoint(-9F, -41F, -12F);
        Chest.setTextureSize(512, 256);
        Chest.mirror = true;
        setRotation(Chest, 0F, 0F, 0.074351F);

        Hunch_2 = new ModelRenderer(this, 0, 15);
        Hunch_2.addBox(0F, 0F, 0F, 7, 4, 20);
        Hunch_2.setRotationPoint(-6F, -31F, -6F);
        Hunch_2.setTextureSize(512, 256);
        Hunch_2.mirror = true;
        setRotation(Hunch_2, 0F, 0F, 0.074351F);

        Trap_L = new ModelRenderer(this, 154, 182);
        Trap_L.addBox(0F, 0F, 0F, 9, 8, 13);
        Trap_L.setRotationPoint(5F, -62F, -18F);
        Trap_L.setTextureSize(512, 256);
        Trap_L.mirror = true;
        setRotation(Trap_L, 0F, 0F, 0.074351F);

        Trap_R = new ModelRenderer(this, 154, 182);
        Trap_R.addBox(0F, 0F, 0F, 9, 8, 13);
        Trap_R.setRotationPoint(5F, -62F, 11F);
        Trap_R.setTextureSize(512, 256);
        Trap_R.mirror = true;
        setRotation(Trap_R, 0F, 0F, 0.074351F);

        Mini_Hunch = new ModelRenderer(this, 116, 145);
        Mini_Hunch.addBox(0F, 0F, 0F, 11, 6, 30);
        Mini_Hunch.setRotationPoint(-6F, -68F, -11F);
        Mini_Hunch.setTextureSize(512, 256);
        Mini_Hunch.mirror = true;
        setRotation(Mini_Hunch, 0F, 0F, 0.074351F);


        Arm_R = new ModelRenderer(this, 199, 179);
        Arm_R.addBox(0F, 0F, 0F, 16, 34, 10);
        Arm_R.setRotationPoint(0F, -56F, 20F);
        setRotation(Arm_R, 0F, 0F, -0.1858931F);

        Rpalm = new ModelRenderer(this, 199, 241);
        Rpalm.addBox(0F, 0F, 0F, 5, 6, 8);
        Rpalm.setRotationPoint(16F, -17.25F, -21F);
        Rpalm.setTextureSize(512, 256);
        Rpalm.mirror = true;
        setRotation(Rpalm, 0F, 0F, -0.185895F);

        Rthumb = new ModelRenderer(this, 226, 248);
        Rthumb.addBox(0F, 0F, 0F, 4, 5, 2);
        Rthumb.setRotationPoint(16F, -17.3F, -13F);
        Rthumb.setTextureSize(512, 256);
        Rthumb.mirror = true;
        setRotation(Rthumb, 0.1312612F, 0F, -0.185895F);

        HandR = new ModelRenderer(this, 199, 224);
        HandR.addBox(0F, 0F, 0F, 8, 8, 8);
        HandR.setRotationPoint(12F, -24F, -21F);
        HandR.setTextureSize(512, 256);
        HandR.mirror = true;
        setRotation(HandR, 0F, 0F, -0.1858931F);


        HandL = new ModelRenderer(this, 199, 224);
        HandL.addBox(0F, 0F, 0F, 8, 8, 8);
        HandL.setRotationPoint(11F, -24F, 21F);
        HandL.setTextureSize(512, 256);
        HandL.mirror = true;
        setRotation(HandL, 0F, 0F, -0.1858931F);

        Arm_L = new ModelRenderer(this, 199, 179);
        Arm_L.addBox(0F, 0F, 0F, 16, 34, 10);
        Arm_L.setRotationPoint(0F, -56F, -22F);
        setRotation(Arm_L, 0F, 0F, -0.185895F);

        LPalm = new ModelRenderer(this, 199, 241);
        LPalm.addBox(0F, 0F, 0F, 5, 6, 8);
        LPalm.setRotationPoint(15F, -17.3F, 21F);
        LPalm.setTextureSize(512, 256);
        LPalm.mirror = true;
        setRotation(LPalm, 0F, 0F, -0.185895F);

        Lthumb = new ModelRenderer(this, 226, 248);
        Lthumb.addBox(0F, 0F, -2F, 4, 5, 2);
        Lthumb.setRotationPoint(16F, -17.3F, 21F);
        Lthumb.setTextureSize(512, 256);
        Lthumb.mirror = true;
        setRotation(Lthumb, -0.1487144F, 0F, -0.185895F);

        LLeg = new ModelRenderer(this,0, 237 );
        LLeg.addBox(0F, 36F, 0F, 22, 5, 14);
        LLeg.setRotationPoint(0F, 19F, -11F);
        LLeg.setTextureOffset(0, 186).addBox(0F, 0F, 0F, 16, 36, 14).setRotationPoint(0F, -17F, -11F);
        setRotation(LLeg, 0F, 0F, 0F);

        RLeg = new ModelRenderer(this,0,237);
        RLeg.addBox(0F, 36F, 0F, 22, 5, 14);
        RLeg.setRotationPoint(0F, 19F, 5F);
        RLeg.setTextureOffset( 0, 186).addBox(0F, 0F, 0F, 16, 36, 14).setRotationPoint(0F, -17F, 5F);

        setRotation(RLeg, 0F, 0F, 0F);










    }


    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5,entity);
        Body.render(f5);
        Head.render(f5);
        Waist_1_.render(f5);
        Waist_2_.render(f5);
        Waist_3_.render(f5);
        Waist_4_.render(f5);
        RLeg.render(f5);
        LLeg.render(f5);
        Arm_R.render(f5);
        HandL.render(f5);
        HandR.render(f5);
        Arm_L.render(f5);
        Hunch.render(f5);
        Chest.render(f5);
        Hunch_2.render(f5);
        Trap_L.render(f5);
        Trap_R.render(f5);
        Mini_Hunch.render(f5);
        Tail_4.render(f5);
        Tail_3.render(f5);
        tail_3.render(f5);
        Tail_1.render(f5);
        Tail_5.render(f5);
        Tail_6.render(f5);
        Tail_7_.render(f5);
        Tail_8_.render(f5);
        Hocico.render(f5);
        Rear.render(f5);
        Lear.render(f5);
        Rpalm.render(f5);
        Rthumb.render(f5);
        Lthumb.render(f5);
        LPalm.render(f5);

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

        this.LLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1 / 1.0F;
        this.RLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1 / 1.0F;

    }



}
