package phoenix.family.impl;

import phoenix.family.Cloth;

/**
 * @author mert on 5.02.2023
 * @project AbstractFactoryPatternDemo
 */
public class Hoodie implements Cloth {

    @Override
    public String getType() {
        return "Hoodie";
    }

    @Override
    public String getColor() {
        return "Blue";
    }
}
