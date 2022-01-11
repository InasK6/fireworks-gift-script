

class Fille extends Maman with JLejeune (var age:Int = 0, var taille:Int,val aniv:Date){
  def anniversaire (){
    val now = Calendar.getInstance()
    if(aniv.get(Calendar.DAY) == now.get(Calendar.DAY) && aniv.get(Calendar.MONTHS) == now.get(Calendar.MONTHS){
      age+=1
    }
  }
}