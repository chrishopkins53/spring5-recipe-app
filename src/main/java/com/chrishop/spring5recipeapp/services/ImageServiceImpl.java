package com.chrishop.spring5recipeapp.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by chris on 19/04/18
 */
@Slf4j
@Service
public class ImageServiceImpl  implements ImageService {

    @Override
    public void saveImageFile(Long recipeId, MultipartFile file) {

        log.debug("Recieved a file");
    }
}
