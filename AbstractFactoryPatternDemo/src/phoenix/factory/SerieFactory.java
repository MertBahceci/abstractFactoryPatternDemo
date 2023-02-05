package phoenix.factory;

import phoenix.family.ClothEnum;
import phoenix.family.Serie;
import phoenix.family.SerieEnum;
import phoenix.family.base.BaseEnum;
import phoenix.family.impl.*;

/**
 * @author mert on 6.02.2023
 * @project AbstractFactoryPatternDemo
 */
public class SerieFactory implements AbstractFactory<Serie>{

    @Override
    public Serie generate(BaseEnum baseEnum) {
        SerieEnum serieEnum = (SerieEnum) baseEnum;
        if (serieEnum.compareTo(SerieEnum.SOPRANOS) == 0){
            return new Sopranos();
        }else if (serieEnum.compareTo(SerieEnum.WEDNESDAY) == 0){
            return new Wednesday();
        }else
            return null;
    }
}
