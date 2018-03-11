package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by zhuyangyong on 2018/3/10.
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
