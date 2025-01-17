package ten3.lib.client.element;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import ten3.util.TranslateKeyUtil;

import java.util.ArrayList;
import java.util.List;

public class ElementBarEnergy extends ElementImage {

    List<Component> list = new ArrayList<>();
    int auc;
    int mxe;
    int eneI;
    int eneO;
    int itmI;
    int itmO;

    public ElementBarEnergy(int xr, int y, int w, int h, int xOff, int yOff, ResourceLocation resourceLocation) {

        super(xr, y, w, h, xOff, yOff, resourceLocation);

    }

    public void update(int ch, int fet, int ei, int eo, int ii, int io) {
        auc = fet;
        mxe = ch;
        eneI = ei;
        eneO = eo;
        itmI = ii;
        itmO = io;
    }

    @Override
    public void onMouseClicked(int mouseX, int mouseY) {
        //no act
    }

    @Override
    public void addToolTip(List<Component> tooltips) {

        list.add(TranslateKeyUtil.translated(TranslateKeyUtil.GOLD, "ten3.info.bar_energy"));

        list.add(TranslateKeyUtil.translated("ten3.info.bar_energy_fact"));
        list.add(TranslateKeyUtil.translated(TranslateKeyUtil.RED, Math.abs(mxe) + " FE/t"));
        list.add(TranslateKeyUtil.translated("ten3.info.bar_energy_max"));
        list.add(TranslateKeyUtil.translated(TranslateKeyUtil.RED, auc + " FE/t"));

        list.add(TranslateKeyUtil.translated("ten3.info.bar_energy_in_max"));
        list.add(TranslateKeyUtil.translated(TranslateKeyUtil.RED, eneI + " FE/t"));
        list.add(TranslateKeyUtil.translated("ten3.info.bar_energy_out_max"));
        list.add(TranslateKeyUtil.translated(TranslateKeyUtil.RED, eneO + " FE/t"));

        list.add(TranslateKeyUtil.translated("ten3.info.bar_item_in_max"));
        list.add(TranslateKeyUtil.translated(TranslateKeyUtil.RED, itmI + " IS/t"));
        list.add(TranslateKeyUtil.translated("ten3.info.bar_item_out_max"));
        list.add(TranslateKeyUtil.translated(TranslateKeyUtil.RED, itmO + " IS/t"));

        tooltips.addAll(list);

        list.clear();

    }

}
