package org.vishnu.gift;

/**
 * @author vishnu.g
 * @project org.vishnu.gift : composite-pattern
 * @created 06/Jun/2020
 */

import java.util.ArrayList;
import java.util.List;

/** Composite class **/
public class GiftSurpriseBox implements SurpriseBox {

    private List<SurpriseBox> surpriseBoxes;

    public GiftSurpriseBox() {
        surpriseBoxes = new ArrayList<>();
    }

    @Override
    public void unWrap() {
        surpriseBoxes.forEach(SurpriseBox::unWrap);
    }

    public void add(SurpriseBox surpriseBox) {
        this.surpriseBoxes.add(surpriseBox);
    }

    public void remove(SurpriseBox surpriseBox) {
        this.surpriseBoxes.remove(surpriseBox);
    }
}
