package jp.ac.uryukyu.ie.ayumu;

public class Main {
    public static void main(String[] args){

        //ヒーローとエネミーの作成
        Hero hero = new Hero("勇者", 10, 5);
        Enemy enemy = new Enemy("スライム", 6, 3);

        System.out.printf("%s vs. %s\n", hero.getName(), enemy.getName());

        //ターン数のカウント
        int turn = 0;

        //どちらかの生存フラグが折れるまでループ
        while( hero.isDead() == false && enemy.isDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            hero.attack(enemy);
            enemy.attack(hero);
        }
        System.out.println("戦闘終了");
    }
}