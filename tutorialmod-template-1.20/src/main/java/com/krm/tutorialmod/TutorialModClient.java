package com.krm.tutorialmod;

import com.krm.tutorialmod.item.Moditems;
import net.fabricmc.api.ClientModInitializer;

public class TutorialModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Moditems.registerModItems();
    }
}

