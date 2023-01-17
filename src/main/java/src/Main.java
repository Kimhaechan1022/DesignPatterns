package src;

import static src.builder.BuilderExam.runBuilderExam;
import static src.composite.CompositeExam.*;

import static src.cor.ChainOfResponsibility.runChainOfResponsibilityExam;
import static src.decorator.DecoratorExam.runDecoratorExam;
import static src.facade.FacadeExam.runFacadeExam;
import static src.factoryMethod.FactoryMethodExam.*;
import static src.mediator.MediatorExam.*;

import static src.memento.MementoExam.runMementoExam;
import static src.observer.ObserverExam.*;
import static src.prototype.PrototypeExam.runPrototypeExam;
import static src.proxy.FroxyExam.runFroxyExam;

public class Main {

    public static void main(String[] args){
//        runCompositeExam();
//        runFactoryMethodExam();
//        runObserverExam();
//        runMediatorExam();
//        runMementoExam();
//        runFroxyExam();
//        runChainOfResponsibilityExam();
//        runPrototypeExam();
//        runFacadeExam();
        runBuilderExam();
    }

}
