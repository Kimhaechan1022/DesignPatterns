package src;

import static src.abstractFactory.AbstractFactoryExam.runAbstractFactoryExam;
import static src.builder.BuilderExam.runBuilderExam;
import static src.command.CommandExam.runCommandExam;
import static src.composite.CompositeExam.*;

import static src.cor.ChainOfResponsibilityExam.runChainOfResponsibilityExam;
import static src.decorator.DecoratorExam.runDecoratorExam;
import static src.facade.FacadeExam.runFacadeExam;
import static src.factoryMethod.FactoryMethodExam.*;
import static src.interpreter.InterpreterExam.runInterpreterExam;
import static src.mediator.MediatorExam.*;

import static src.memento.MementoExam.runMementoExam;
import static src.observer.ObserverExam.*;
import static src.prototype.PrototypeExam.runPrototypeExam;
import static src.proxy.FroxyExam.runFroxyExam;
import static src.state.StateExam.runStateExam;
import static src.visitor.VisitorExam.runVisitorExam;

public class Main {

    public static void main(String[] args){
//        runCompositeExam();
//        runFactoryMethodExam();
//        runObserverExam();
//        runMediatorExam();
//        runMementoExam();
//        runFroxyExam();
        runChainOfResponsibilityExam();
//        runPrototypeExam();
//        runFacadeExam();
//        runBuilderExam();
//        runCommandExam();
//        runAbstractFactoryExam();
//        runStateExam();
//        runInterpreterExam();
//        runVisitorExam();

    }

}
