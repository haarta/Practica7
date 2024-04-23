

class Main {


    interface Animal {
        public void speak();
    }

    interface Fly {
        public void fly_obj();
    }

    interface Prog {
        public void WriteCode();
    }

    interface Cooking {
        public void CookFood();
    }


    interface Drive {
        public void DriveAuto();
    }

    public static class Dog implements Animal {
        public void speak() {
            System.out.println("Собака лает!");
        }
    }

    public static class Cat implements Animal {
        @Override
        public void speak() {
            System.out.println("Кошка мяукает!");
        }
    }


    public static class CosmShip implements Fly {
        @Override
        public void fly_obj() {
            System.out.println("Космический корабль летит");
        }
    }

    public static class Airplane implements Fly {
        @Override
        public void fly_obj() {
            System.out.println("Самолет летит");

        }
    }

    public static class Helicopter implements Fly {
        @Override
        public void fly_obj() {
            System.out.println("Вертолет летит");
        }
    }

    public static class Worker {
        String name;

        Worker(String name) {
            this.name = name;

        }

        public String voice() {
            return name;

        }
    }


    public static class Programmer extends Worker implements Prog {

        Programmer(String name) {
            super(name);
        }

        @Override
        public void WriteCode() {
            System.out.println("Меня зовут " + voice() + ". Я умею писать код!");
        }
    }

    public static class Driver extends Worker implements Drive {
        Driver(String name) {
            super(name);
        }

        @Override
        public void DriveAuto() {
            System.out.println("Меня зовут " + voice() + ". Я умею водить автомобиль!");
        }
    }

    public static class Povar extends Worker implements Cooking {
        Povar(String name) {
            super(name);
        }

        @Override
        public void CookFood() {
            System.out.println("Меня зовут " + voice() + ". Я умею готовить еду!");
        }
    }


    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        dog1.speak();
        cat1.speak();

        System.out.println("2 задание__________________________________________");

        CosmShip csm1 = new CosmShip();
        Airplane air1 = new Airplane();
        Helicopter hel1 = new Helicopter();

        csm1.fly_obj();
        air1.fly_obj();
        hel1.fly_obj();

        System.out.println("3 задание__________________________________________");

        Programmer pr = new Programmer("Ivan");
        Programmer pr1 = new Programmer("Oleg");
        Programmer pr2 = new Programmer("Stepan");
        pr.WriteCode();
        pr1.WriteCode();
        pr2.WriteCode();

        Driver dr = new Driver("Seryoga");
        dr.DriveAuto();

        Povar pv = new Povar("Igor");
        pv.CookFood();

    }
}
