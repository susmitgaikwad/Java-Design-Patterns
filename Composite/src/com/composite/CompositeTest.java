package com.composite;

public class CompositeTest {

    public static void main(String[] args)
    {
        Component hardDrive = new Leaf(4000, "HDD");
        Component mouse = new Leaf(500, "Mouse");
        Component monitor = new Leaf(8000, "Monitor");
        Component ram = new Leaf(3000, "RAM");
        Component cpu = new Leaf(9000, "CPU");

        Composite ph = new Composite("Peripheral");
        Composite cabinet = new Composite("Cabinet");
        Composite motherboard = new Composite("Motherboard");
        Composite computer = new Composite("Computer");

        motherboard.addComponent(cpu);
        motherboard.addComponent(ram);

        ph.addComponent(mouse);
        ph.addComponent(monitor);
        cabinet.addComponent(hardDrive);
        cabinet.addComponent(motherboard);

        computer.addComponent(ph);
        computer.addComponent(cabinet);

        computer.showPrice();
    }
}


