package darky.hooklib.hooks;

import darky.hooklib.minecraft.PrimaryClassTransformer;
import darky.hooklib.minecraft.HookLoader;

public class HooksLoader extends HookLoader {

    @Override
    public String[] getASMTransformerClass() {
        return new String[]{PrimaryClassTransformer.class.getName()};
    }

    @Override
    public void registerHooks() {
        //регистрируем класс, где есть методы с аннотацией @Hook
        registerHookContainer("darky.hooklib.hooks.BuildingGadgetsHooks");
    }
}
