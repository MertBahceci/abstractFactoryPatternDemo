package phoenix.factory.provider;

import phoenix.factory.AbstractFactory;
import phoenix.factory.ClothFactory;
import phoenix.factory.SerieFactory;
import phoenix.family.ClothEnum;
import phoenix.family.SerieEnum;
import phoenix.family.base.BaseEnum;

/**
 * @author mert on 6.02.2023
 * @project AbstractFactoryPatternDemo
 */
public class FactoryProvider {

    public static AbstractFactory getFactory(BaseEnum baseEnum){
        if (baseEnum instanceof ClothEnum){
            return new ClothFactory();
        }else if (baseEnum instanceof SerieEnum){
            return new SerieFactory();
        }else
            return null;
    }
}
