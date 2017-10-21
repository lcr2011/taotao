package com.taotao.content.service;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbContent;

import java.util.List;

/**
 * Created by Eshaon on 2017-10-20.
 */
public interface ContentService {

    TaotaoResult addContent(TbContent content);

    List<TbContent> getContentByCid(long cid);

}

