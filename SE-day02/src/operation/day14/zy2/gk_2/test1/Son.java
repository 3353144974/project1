package operation.day14.zy2.gk_2.test1;

public class Son extends Father {
    //public void eat() throws ToothPainException {
//    throw new TonguePainException();
//}

//public void eat() throws ToothPainException {
//    throw new PainExecption();
//}

//    public void eat() throws ToothPainException {
//        throw new ToothPainException();
//    }

//    public void eat() throws ToothPainException {
//        throw new BigToothPainException();
//    }

//    public void eat() throws ToothPainException {
//        throw new BigToothPainException();
//        throw new FrontToothPainExcption();
//    }

//    public void drink(){
//        throw new FrontToothPainExcption();
//    }

    public void drink(){
        try {
            System.out.println("喝到了100度的水");
            throw new TonguePainException();
        } catch (TonguePainException e) {
            e.printStackTrace();
        }
    }
}
