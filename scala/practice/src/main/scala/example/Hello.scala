package example

import scala.collection.immutable.ListMap

object Hello extends Greeting with App {
  val input ="ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd"

  val charCnts = input.toCharArray.map(c => (c, 1))
  val gbyChar = charCnts.groupBy(e=> e._1)
  gbyChar.foreach(println)
  println("===========")


  val mrChar = gbyChar.mapValues(_.map{_ => 1}.reduce(_ + _))
  //mapValues[W](f: V => W): Map[K, W] = new MappedValues(f) with DefaultMap[K, W]
  mrChar.foreach(println)
  val seTest = Seq(2,3,4)
  seTest.combinations(2).foreach(println)
  println("----------------")
  List(1,2,3).permutations.mkString("\t").foreach(print)
  println("======1=====")
  ListMap(mrChar.toSeq.sortBy(_._2) :_*).foreach(println)
  val qs = new Quicksort
  val a = Array(5, 3, 2, 2, 1, 1, 9, 39 ,219)
  qs.sort(a).foreach(n=> (print(n), print (" " )))
  println(qs.myNum(1))
  qs.myMap.foreach(println)
  val streams = (0 to 5).map(i => (i,1))
  streams.foreach(println)

}
class Quicksort {
  def sort(a:Array[Int]) : Array[Int] = {
    if( a.length <2) a
    else
      {
        val pivot = a(a.length/2)
        sort(a filter(pivot > )) ++ a.filter(pivot ==) ++ sort(a.filter(pivot<))
      }
  }
  val myNum : Function1[Int, String] = myInt => "num = " + myInt.toString
  val myMap = Map(1->"one", 2->"two")

}
trait Greeting {
  lazy val greeting: String = "hello"
}
