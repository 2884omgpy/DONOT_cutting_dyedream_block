package com._2884omgpy.donotcuttingdyedreamblock.mixin;

import com.simibubi.create.foundation.data.RuntimeDataGenerator;
import net.minecraft.resources.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = RuntimeDataGenerator.class, remap = false)
public class CuttingRecipesMixin
{
    @Inject(method = "cuttingRecipes", at = @At("HEAD"), cancellable = true, remap = false)
    private static void onCuttingRecipes(ResourceLocation itemId, CallbackInfo ci)
    {
        String path = itemId.getPath();
        String namespace = itemId.getNamespace();
        if (namespace.equals("pasterdream") && path.startsWith("dyedream_"))
        {
            ci.cancel();
        }
    }
}
