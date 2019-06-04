package edu.graduate.util;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public class ImgUtil {
	public static String upload(String oldPath, MultipartFile file, HttpServletRequest request)
			throws IllegalStateException, IOException {
		String fileSuffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		String suffix = fileSuffix.toUpperCase();
		String dir = null;
		if (".PNG".equals(suffix) || ".JPG".equals(suffix) || ".JPEG".equals(suffix)) {
			dir = request.getServletContext().getRealPath("/upload");
		} 
		File fileDir = new File(dir);
		if (!fileDir.exists()) {
			fileDir.mkdirs();
		}
		String fileName = System.currentTimeMillis() + fileSuffix;
		File files = new File(fileDir + "/" + fileName);
		File old = new File(fileDir + "/" + oldPath);
		if(old.exists()){
			old.delete();
		}
		file.transferTo(files);
		return fileName;
	}

}
