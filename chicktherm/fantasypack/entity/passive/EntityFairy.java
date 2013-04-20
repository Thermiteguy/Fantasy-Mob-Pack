package chicktherm.fantasypack.entity.passive;

import net.minecraft.entity.*;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityFairy extends EntityCreature {

	public EntityFairy(World par1World) {
		super(par1World);
		 this.texture = "/chicktherm/Textures/Mobs/Fairy/Fairy.png";
		 this.setSize(0.2F, 0.6F);
		 float f = 0.25F;
		 this.tasks.addTask(0, new EntityAISwimming(this));
	        this.tasks.addTask(1, new EntityAIPanic(this, 0.50F));
	         this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
	          this.tasks.addTask(3, new EntityAIWander(this, this.moveSpeed));
	}
	
	 protected void fall(float par1) {}
	 
	 public boolean isAIEnabled()
	    {
	        return true;
	    }
	public int getMaxHealth() {
	
		return 4;
	}
	public int getMoveSpeed() {
		return 1;
	}
	 protected void updateAITasks()
	    {
	        super.updateAITasks();
	    }

	 protected String getHurtSound()
	    {
	        return "mob.pig.say";
	    }

	    /**
	     * Returns the sound this mob makes on death.
	     */
	    protected String getDeathSound()
	    {
	        return "mob.pig.say";
	    }
	    protected String getLivingSound()
	    {
	        return "mob.pig.say";
	    }
}
