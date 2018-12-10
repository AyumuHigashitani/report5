package jp.ac.uryukyu.ie.ayumu;

public class LivingThing {

    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    //コンストラクタ作成
    public LivingThing(String  name, int hitPoint, int attack){

        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        this.dead = false;

        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);

    }

    //生存フラグ
    public boolean isDead(){
        return dead;
    }

    //攻撃メソッド
    public void attack(LivingThing opponent){

        if (dead == false){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);

        }
    }

    //ダメージメソッド
    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 1) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

    //getter一覧

    public boolean getDead(){
        return dead;
    }

    public String getName(){
        return name;
    }

    public int getHitPoint(){
        return hitPoint;
    }

    public int getAttack(){
        return attack;
    }

    //setter一覧

    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }
}
