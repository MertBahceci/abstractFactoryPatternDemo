package phoenix.factory;

import phoenix.family.Cloth;
import phoenix.family.ClothEnum;
import phoenix.family.base.BaseEnum;
import phoenix.family.impl.Hoodie;
import phoenix.family.impl.TShirt;
import phoenix.family.impl.Trousers;

/**
 * @author mert on 6.02.2023
 * @project AbstractFactoryPatternDemo
 */
public class ClothFactory implements AbstractFactory<Cloth> {

    @Override
    public Cloth generate(BaseEnum baseEnum) {
        ClothEnum clothEnum = (ClothEnum) baseEnum;

        if (clothEnum.compareTo(ClothEnum.TSHIRT) == 0){
            return new TShirt();
        }else if (clothEnum.compareTo(ClothEnum.TROUSERS) == 0){
            return new Trousers();
        }else if (clothEnum.compareTo(ClothEnum.HOODIE) == 0){
            return new Hoodie();
        }else
            return null;
    }
}
