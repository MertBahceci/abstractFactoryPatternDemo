package phoenix.family.impl;

import phoenix.family.Cloth;

/**
 * @author mert on 5.02.2023
 * @project AbstractFactoryPatternDemo
 */
public class Trousers implements Cloth {

    @Override
    public String getType() {
        return "Trousers";
    }

    @Override
    public String getColor() {
        return "Black";
    }
}
