package kr.hs.dgsw.java.dept23.d0512;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileStudy {

	public void studyFileData() throws Exception {
		
		File file = new File("C:/90_ETC/fileStudy/sample.txt");
		File file2 = new File("C:/90_ETC/fileStudy/none.txt");
		File file3 = new File("C:/90_ETC/fileStudy");
		
		/* 파일의 물리적 존재 여부 */
		boolean exist = file.exists();
		System.out.println("파일의 물리적 존재 여부");
		System.out.println(file.getName() + "  " + exist);
		System.out.println(file2.getName() + "  " + file2.exists());
		System.out.println(file3.getName() + "  " + file3.exists());
		System.out.println();
		
		/* 파일, 디렉토리 판단 */
		boolean bFile = file.isFile();
		boolean bDir = file.isDirectory();
		
		System.out.println("파일, 디렉토리 판단");
		System.out.println(file.getName() + "  " + bFile + "  " + bDir);
		System.out.println(file2.getName() + "  " + file2.isFile() + "  " + file2.isDirectory());
		System.out.println(file3.getName() + "  " + file3.isFile() + "  " + file3.isDirectory());
		System.out.println();
		
		/* 파일의 경로 */
		File file4 = new File("../hello.jpg");
		String path = file4.getPath();
		String absolutePath = file4.getAbsolutePath();
		String canonicalPath = file4.getCanonicalPath();
		
		System.out.println("파일의 경로");
		System.out.println("getPath() : " + path);
		System.out.println("getAbsolutePath() : " + absolutePath);
		System.out.println("getCanonicalPath() : " + canonicalPath);
		System.out.println();
		
		/* 파일의 크기 */
		long size = file.length();
		System.out.println("파일의 크기");
		System.out.println(file.getName() + "  " + size);
		System.out.println(file2.getName() + "  " + file2.length());
		System.out.println(file3.getName() + "  " + file3.length());
		System.out.println();		
		
		/* 수정된 시각 */
		long time = file.lastModified();
		System.out.println("수정된 시각");
		System.out.println(file.getName() + "  " + formatDate(convertToDate(time)));
		System.out.println();	
	}
	
	public void studyManage() throws Exception {
		
		File file = new File("C:/90_ETC/fileStudy/hello.txt");
		
		/* 파일 생성 */
		boolean created = file.createNewFile();
		System.out.println("파일 생성");
		System.out.println(file.getName() + "  " + created);
		System.out.println();	
		
		/* 파일 삭제 */
		boolean deleted = file.delete();
		System.out.println("파일 삭제");
		System.out.println(file.getName() + "  " + deleted);
		System.out.println();	
		
		File dir = new File("C:/90_ETC/fileStudy/subDir"); 
		
		/* 디렉토리 생성 */
		created = dir.mkdir();
		System.out.println("디렉토리 생성");
		System.out.println(dir.getName() + "  " + created);
		System.out.println();	

		File dir2 = new File("C:/90_ETC/fileStudy/user/image"); 
		created = dir2.mkdirs();
		System.out.println("디렉토리 생성");
		System.out.println(dir2.getName() + "  " + created);
		System.out.println();	

		/* 디렉토리 삭제 */
		deleted = dir.delete();
		System.out.println("디렉토리 삭제");
		System.out.println(dir.getName() + "  " + deleted);
		System.out.println();	

		/* 파일 이름 바꾸기 */
		File original = new File("C:/90_ETC/fileStudy/sample.txt");
		File target = new File("C:/90_ETC/fileStudy/target/진달래꽃.txt");
		original.renameTo(target);
		
	}
	
	public void studyList() {
		File dir = new File("C:/");
		
		String[] list = dir.list();
		for (String name : list) {
			System.out.println(name);
		}
		
		System.out.println("-----------------------------------");
		
		File[] listFiles = dir.listFiles();
		for (File file : listFiles) {
			System.out.println(file.getAbsolutePath());
		}
	}
	
	public Date convertToDate(long unixTime) {
		return new Date(unixTime);
	}

	public String formatDate(Date date) {
		SimpleDateFormat dateFormat = 
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.format(date);
	}
	
	public static void main(String[] args) throws Exception {
		FileStudy fileStudy = new FileStudy();
		//fileStudy.studyFileData();
		//fileStudy.studyManage();
		fileStudy.studyList();
	}

}
