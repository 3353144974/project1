package operation.day10._05;

public class Player {
    public static void main(String[] args) {
        Player p=new Player();
        String str="法师角色";
        System.out.println("选择:"+str);
        p.select(str).commonFight();
        p.select(str).specialFight();
        System.out.println("===============");
        str="武力角色";
        System.out.println("选择:"+str);
        p.select(str).commonFight();
        p.select(str).specialFight();
    }
    public FightAble select(String str) {
        if(str=="法师角色"){
            return new Mage();
        }else if(str=="武力角色"){
            return new Warrior();
        }
            return null;
    }
}
