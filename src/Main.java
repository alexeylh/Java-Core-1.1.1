class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        // int c = calc.divide.apply(a, b); // данная операция приведёт к ошибке из-за деления на ноль

        /* Простая программа-калькулятор не должна упасть из-за деления на ноль.
        В качестве средства исправления просто сообщим пользователю о невозможности
        выполнить данную операцию, для чего служит исправленный метод.
        В качестве результата возвращается делимое. */
        int c = calc.divideWithZeroCheck.apply(a, b);

        calc.println.accept(c);
    }
}
