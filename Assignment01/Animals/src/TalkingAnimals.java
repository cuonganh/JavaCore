public class TalkingAnimals
{
   public static void main(String args[])
   {
      Animal[] zoo = new Animal[4];

      zoo[0] = new Animal();
      zoo[1] = new Koala();
      zoo[2] = new Kangaroo();
      zoo[3] = new Emu();

      for (int i = 0; i < zoo.length; ++i)
      {
         zoo[i].talk();
      }
   }
}
