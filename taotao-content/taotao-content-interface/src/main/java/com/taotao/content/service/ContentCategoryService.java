package com.taotao.content.service;

import java.util.List;

import com.taotao.common.pojo.EasyUITreeNode;
import com.taotao.common.pojo.TaotaoResult;

/**
 * Created by Eshaon on 2017-10-20.
 */
public interface ContentCategoryService {

    List<EasyUITreeNode> getContentCategoryList(long parentId);

    TaotaoResult addContentCategory(Long parentId, String name);

}
