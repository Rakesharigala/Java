package Problems;

abstract class collage {
	public void location() {

		System.out.println("nellore");
	}

	abstract public void working_day();

	class Abstarct extends collage {

		@Override
		public void working_day() {
			// TODO Auto-generated method stub
			System.out.println("ture");

		}

		public class aa {

			public static void main(String args[]) {
				Abstarct c = new Abstarct();
				c.location();
				c.working_day();

			}
		}
	}

}
