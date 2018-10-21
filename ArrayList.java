public class ArrayList implements List{
	Object[] a=new Object[10];
	int size=0;

	public void add(Object obj){
		if(a.length==size){
			growArr();
		}
		a[size]=obj;
		++size;
	}
	public void add(int pos, Object obj){
		if(pos<0||pos>size){
			throw new IllegalArgumentException("Not a valid position in the Array");
		}
		if(a.length==size){
			growArr();
		}
		for(int i=size;i>pos;i--){
			a[i]=a[i-1];
		}
		a[pos]=obj;
		++size;
	}
	public Object get(int pos){
		return a[pos];
	}
	public Object remove(int pos){
		if(pos<0||pos>=size){
			throw new IllegalArgumentException("Not a valid position in the Array");
		}
		Object ob=a[pos];
		for(int i=pos;i<=size-1;i++){
			a[i]=a[i+1];
			--size;
		}
		return ob;
	}
	public int size(){
		return size;
	}

	public void growArr(){
		Object[] temp=new Object[a.length*2];

		for (int i=0;i<a.length;i++){
			temp[i]=a[i];
			}
		a=temp;
	}
}