package com.mithu.Template.TeaCoffeeSolutionUsingHook;

/**
 * Created by mithu on 8/6/18.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Prepare Tea>>>>>>>>>>>>>>>>>>");
        Tea tea = new Tea();
        tea.prepare();

        System.out.println("\nPrepare Coffee>>>>>>>>>>>>>>>>>>");

        Coffee coffee = new Coffee();
        coffee.prepare();

        System.out.println("\nPrepare LemonTea>>>>>>>>>>>>>>>>>>");

        LemonTea lemonTea = new LemonTea();
        lemonTea.prepare();
    }
}
