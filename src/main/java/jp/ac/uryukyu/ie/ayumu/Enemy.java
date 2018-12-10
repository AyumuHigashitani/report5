package jp.ac.uryukyu.ie.ayumu;

public class Enemy extends LivingThing {

    //コンストラクタ作成
    public Enemy(String name, int hp, int attack){
        super(name,hp,attack);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        setHitPoint(getHitPoint() -damage);
        if( getHitPoint() < 1 ) {
            setDead(true);
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }

}