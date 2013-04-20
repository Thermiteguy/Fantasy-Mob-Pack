
package chicktherm.fantasypack.client.model;
 
import net.minecraft.client.model.*;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelFairy extends ModelBase
{
	//fields
		ModelRenderer Head;
	    ModelRenderer Rightarm;
	    ModelRenderer Body;
	    ModelRenderer Leftarm;
	    ModelRenderer Leftleg;
	    ModelRenderer Rightleg;
	    ModelRenderer leftwing;
	    ModelRenderer rightwing;
	  
	  public ModelFairy()
	  {
	    textureWidth = 20;
	    textureHeight = 18;
	    
	      Head = new ModelRenderer(this, 0, 0);
	      Head.addBox(0F, 0F, 0F, 4, 4, 4);
	      Head.setRotationPoint(-2F, 12F, -2F);
	      Head.setTextureSize(20, 18);
	      Head.mirror = true;
	      setRotation(Head, 0F, 0F, 0F);
	      Rightarm = new ModelRenderer(this, 4, 8);
	      Rightarm.addBox(0F, 0F, 0F, 1, 4, 1);
	      Rightarm.setRotationPoint(0F, 16F, -2F);
	      Rightarm.setTextureSize(20, 18);
	      Rightarm.mirror = true;
	      setRotation(Rightarm, 0F, 0F, 0F);
	      Body = new ModelRenderer(this, 15, 11);
	      Body.addBox(0F, 0F, 0F, 1, 4, 2);
	      Body.setRotationPoint(0F, 16F, -1F);
	      Body.setTextureSize(20, 18);
	      Body.mirror = true;
	      setRotation(Body, 0F, 0F, 0F);
	      Leftarm = new ModelRenderer(this, 4, 8);
	      Leftarm.addBox(0F, 0F, 0F, 1, 4, 1);
	      Leftarm.setRotationPoint(0F, 16F, 1F);
	      Leftarm.setTextureSize(20, 18);
	      Leftarm.mirror = true;
	      setRotation(Leftarm, 0F, 0F, 0F);
	      Leftleg = new ModelRenderer(this, 0, 8);
	      Leftleg.addBox(0F, 0F, 0F, 1, 4, 1);
	      Leftleg.setRotationPoint(0F, 20F, 0F);
	      Leftleg.setTextureSize(20, 18);
	      Leftleg.mirror = true;
	      setRotation(Leftleg, 0F, 0F, 0F);
	      Rightleg = new ModelRenderer(this, 0, 8);
	      Rightleg.addBox(0F, 0F, 0F, 1, 4, 1);
	      Rightleg.setRotationPoint(0F, 20F, -1F);
	      Rightleg.setTextureSize(20, 18);
	      Rightleg.mirror = true;
	      setRotation(Rightleg, 0F, 0F, 0F);
	      leftwing = new ModelRenderer(this, 8, 8);
	      leftwing.addBox(0F, 0F, 0F, 3, 2, 1);
	      leftwing.setRotationPoint(-3F, 16F, 0F);
	      leftwing.setTextureSize(20, 18);
	      leftwing.mirror = true;
	      setRotation(leftwing, 0F, 0F, 0F);
	      rightwing = new ModelRenderer(this, 0, 13);
	      rightwing.addBox(0F, 0F, 0F, 3, 2, 1);
	      rightwing.setRotationPoint(-3F, 16F, -1F);
	      rightwing.setTextureSize(20, 18);
	      rightwing.mirror = true;
	      setRotation(rightwing, 0F, 0F, 0F);
	  }
	  
	  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	    Head.render(f5);
	    Rightarm.render(f5);
	    Body.render(f5);
	    Leftarm.render(f5);
	    Leftleg.render(f5);
	    Rightleg.render(f5);
	    leftwing.render(f5);
	    rightwing.render(f5);
	  }
	  
	  private void setRotation(ModelRenderer model, float x, float y, float z)
	  {
	    model.rotateAngleX = x;
	    model.rotateAngleY = y;
	    model.rotateAngleZ = z;
	  }
	  
	  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	  {
	    this.Head.rotateAngleY = f4 / (180F / (float)Math.PI);
        this.Head.rotateAngleX = f5 / (180F / (float)Math.PI);
        this.Rightarm.rotateAngleX = MathHelper.cos(f1 * 0.6662F + (float)Math.PI) * 2.0F * f2 * 0.5F;
        this.Leftarm.rotateAngleX = MathHelper.cos(f1 * 0.6662F) * 2.0F * f2 * 0.5F;
        this.Rightarm.rotateAngleZ = 0.0F;
        this.Leftarm.rotateAngleZ = 0.0F;
        this.Rightleg.rotateAngleX = MathHelper.cos(f1 * 0.6662F) * 1.4F * f2;
        this.Leftleg.rotateAngleX = MathHelper.cos(f1 * 0.6662F + (float)Math.PI) * 1.4F * f2;
        this.Rightleg.rotateAngleY = 0.0F;
        this.Leftleg.rotateAngleY = 0.0F;
	  }
	  

	}

