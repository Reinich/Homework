package Talk_1_Calc;

/**
 * Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(),
 * divide(), subtract().
 * Параметры этих методов – два числа разного типа, над которыми должна быть произведена
 * операция. Методы должны возвращать результат своей работы.
 */
public class Calculator {
    public Calculator() {
    }

    public <T extends Number, U extends Number> Number sum(T a, U b) {
        return new Number() {
            @Override
            public int intValue() {
                return a.intValue() + b.intValue();
            }

            @Override
            public long longValue() {
                return a.longValue() + b.longValue();
            }

            @Override
            public float floatValue() {
                return a.floatValue() + b.floatValue();
            }

            @Override
            public double doubleValue() {
                return a.doubleValue() + b.floatValue();
            }
        };
    }

    public <T extends Number, U extends Number> Number multiply(T a, U b) {
        return new Number() {
            @Override
            public int intValue() {
                return a.intValue() * b.intValue();
            }

            @Override
            public long longValue() {
                return a.longValue() * b.longValue();
            }

            @Override
            public float floatValue() {
                return a.floatValue() * b.floatValue();
            }

            @Override
            public double doubleValue() {
                return a.doubleValue() * b.doubleValue();
            }
        };
    }

    public <T extends Number, U extends Number> Number subtract(T a, U b) {
        return new Number() {
            @Override
            public int intValue() {
                return a.intValue() - b.intValue();
            }

            @Override
            public long longValue() {
                return a.longValue() - b.longValue();
            }

            @Override
            public float floatValue() {
                return a.floatValue() - b.floatValue();
            }

            @Override
            public double doubleValue() {
                return a.doubleValue() - b.doubleValue();
            }
        };
    }

    public <T extends Number, U extends Number> Number divide(T a, U b) {
        return new Number() {
            @Override
            public int intValue() {
                isZero(b);
                return a.intValue() / b.intValue();
            }

            @Override
            public long longValue() {
                isZero(b);
                return a.longValue() / b.longValue();
            }

            @Override
            public float floatValue() {
                isZero(b);
                return a.floatValue() / b.floatValue();
            }

            @Override
            public double doubleValue() {
                isZero(b);
                return a.doubleValue() / b.doubleValue();
            }
        };
    }

    private <T extends Number> void isZero(T t) {
        if (t.equals(0)) {
            throw new ArithmeticException("Divide by zero");
        }
    }
}
