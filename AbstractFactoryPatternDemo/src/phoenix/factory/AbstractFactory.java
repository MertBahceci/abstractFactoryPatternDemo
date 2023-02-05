package phoenix.factory;

import phoenix.family.base.BaseEnum;

/**
 * @author mert on 5.02.2023
 * @project AbstractFactoryPatternDemo
 */
public interface AbstractFactory<T> {

    public T generate(BaseEnum baseEnum);
}
