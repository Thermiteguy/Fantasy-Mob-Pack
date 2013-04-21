package chicktherm.fantasypack.entity.passive;

import net.minecraft.entity.*;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityFairy extends EntityCreature {
	
	private ChunkCoordinates currentFlightTarget;
	
	public EntityFairy(World par1World) {
		super(par1World);
		 this.texture = "/chicktherm/Textures/Mobs/Fairy/Fairy.png";
		 this.setSize(0.2F, 0.6F);
		 float f = 0.25F;
		 this.tasks.addTask(0, new EntityAISwimming(this));
	     this.tasks.addTask(1, new EntityAIPanic(this, 0.5F));
	     this.tasks.addTask(6, new EntityAIWander(this, f));
	     this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
	     this.tasks.addTask(8, new EntityAILookIdle(this));
	     this.tasks.addTask(4, new EntityAITempt(this, 0.45F, Item.sugar.itemID, false));
	     this.moveSpeed = 0.2F;
	}
	
	 protected void fall(float par1) {}
	 


	 public boolean isAIEnabled()
	    {
	        return true;
	    }
	public int getMaxHealth() {
	
		return 4;
	}
	 protected void updateAITasks()
	    {
	        super.updateAITasks();
	    }

	  protected String getLivingSound()
	    {
	        return "mob.pig.say";
	    }

	    /**
	     * Returns the sound this mob makes when it is hurt.
	     */
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

	    /**
	     * Returns true if this entity should push and be pushed by other entities when colliding.
	     */
	    public boolean canBePushed()
	    {
	        return false;
	    }
	    public void onUpdate()
	    {
	        super.onUpdate();

	     
	        {
	            this.motionY *= 0.6000000238418579D;
	        }
	    }
	    protected int getDropItemId()
	    {
	        return this.isBurning() ? Item.diamond.itemID : Item.stick.itemID;
	    }
}
