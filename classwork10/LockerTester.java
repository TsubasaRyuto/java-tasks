class LockerTester{
  public static void main(String[] args){
    //預金1000円で金庫を生成して状態を表示
    Kinko k = new Kinko(1000);
    k.printDeposit();
    //中身を入れた（空でない）状態でロック付き宝石箱を生成して状態を表示
    LockableJewelBox j = new LockableJewelBox(false);
    j.printEmpty();
    //2つのLockableオブジェクトの配列を作り，Lockメソッドを呼ぶ
    Lockable[] l={ k, j};
    for(Lockable i : l) i.lock();
    //それぞれの状態を表示する．
    k.printDeposit();
    j.printEmpty();
  }
}
