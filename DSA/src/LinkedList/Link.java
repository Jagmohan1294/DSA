package LinkedList;

  class Link {
   int iData;
   double dData;
   Link next;
   
   Link (int iData, double dData) {
	   this.iData = iData;
	   this.dData = dData;
   }
   
   void displayLink() {
	   System.out.print("{" + iData + "," + dData + "}");
   }
   public static void main(String args[]) {
	int iData = 1;
	double dData = 1.2;
	Link someLink =  new Link(iData, dData);
	Link alink = someLink;
   }
}
