package darky.hooklib.hooks;

import com.direwolf20.buildinggadgets.common.tools.GadgetUtils;
import com.feed_the_beast.ftbutilities.data.ClaimedChunks;
import darky.hooklib.asm.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class BuildingGadgetsHooks {
    @Hook(createMethod = false, at = @At(point = InjectionPoint.HEAD), returnCondition = ReturnCondition.ON_TRUE)
    public static boolean setRemoteInventory(GadgetUtils util, EntityPlayer player, ItemStack tool, BlockPos pos, int dim, World world){
        if(ClaimedChunks.blockBlockInteractions(player, pos, null)){
            player.sendStatusMessage(new TextComponentString(TextFormatting.AQUA + "Not allowed!"), true);
            return true;
        }
        return false;
    }

}