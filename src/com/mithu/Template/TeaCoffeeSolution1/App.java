package com.mithu.Template.TeaCoffeeSolution1;

/**
 * Created by mithu on 8/6/18.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Prepare Tea>>>>>>>>>>>>>>>>>>");
        Tea tea = new Tea();
        tea.prepare();

        System.out.println("\n Prepare Coffee>>>>>>>>>>>>>>>>>>");
        Coffee coffee = new Coffee();
        coffee.prepare();
    }
}
