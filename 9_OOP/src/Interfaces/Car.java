package Interfaces;

public class Car implements Engine, Break{

    @Override
    public void Brake() {
        System.out.println("I brake like a normal car.");
    }

    @Override
    public void Start() {
        System.out.println("I Start like a normal car.");
 
    }

    @Override
    public void Stop() {
        System.out.println("I Stop like a normal car.");

    }

    @Override
    public void Accelerate() {
        System.out.println("I accelerate like a normal car.");

    }
}
