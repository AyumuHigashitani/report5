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

    /**
     * 生存フラグを確認できるメソッド
     * @return true or false
     */
    public boolean isDead(){
        return dead;
    }

    /**
     * 攻撃をするメソッド
     * @param opponent　攻撃したい敵のクラス
     */
    public void attack(LivingThing opponent){

        if (dead == false){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);

        }
    }

    /**
     * 受けたダメージを計算するメソッド
     * 引数になる受けるダメージ量は，attackメソッドで計算する
     * @param damage　受けるダメージ
     */
    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 1) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

    //getter一覧

    /**
     * nameのゲッター
     * @return name
     */
    public String getName(){
        return name;
    }

    /**
     * hitPointのゲッター
     * @return hitPoint
     */
    public int getHitPoint(){
        return hitPoint;
    }

    /**
     * attackのゲッター
     * @return attack
     */
    public int getAttack(){
        return attack;
    }

    //setter一覧


    /**
     * hitPointのセッター
     * @param hitPoint 変更したいhitPointの値
     */
    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    /**
     * attackのセッター
     * @param attack 変更したいattackの値
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     * nameのセッター
     * @param name 変更したいnameの文字列
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * deadのセッター
     * @param dead 変更したいdeadの true  or false
     */
    public void setDead(boolean dead) {
        this.dead = dead;
    }
}
