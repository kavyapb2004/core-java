class CCTV{
	static boolean isRecording;
	static boolean startOrStopRecording() {
	if(isRecording == false){
		isRecording = true;
		System.out.println(" CCTV started recording ");
	}else{
		isRecording = false;
		System.out.println(" CCTV stopped recording ");
		}
		return isRecording;
	}
}