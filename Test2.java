//overriding
//2
class bank{
    int roi(){
        return 0;
    }
}
class icici extends bank{
    int roi(){
        return 7;
    }
}
class sbi extends bank{
    int roi(){
        return 8;
    }
}
class axis extends bank{
    int roi(){
        return 9;
    }
}
class Test2{
    public static void main(String[] args){
        icici a = new icici();
        sbi b = new sbi();
        axis c = new axis();
        System.out.println("ICICI Rate of Interest : "+a.roi());
        System.out.println("SBI Rate of Interest : "+b.roi());
        System.out.println("AXIS Rate of Interest : "+c.roi());
    }
}