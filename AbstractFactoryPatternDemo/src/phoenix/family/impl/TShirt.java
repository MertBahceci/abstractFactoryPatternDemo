package phoenix.family.impl;

import phoenix.family.Cloth;

/**
 * @author mert on 5.02.2023
 * @project AbstractFactoryPatternDemo
 */
public class TShirt implements Cloth {

    @Override
    public String getType() {
        return "T-Shirt";
    }

    @Override
    public String getColor() {
        return "Red";
    }
}
