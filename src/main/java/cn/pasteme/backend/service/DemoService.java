package cn.pasteme.backend.service;

import cn.pasteme.common.dto.TokenDTO;
import cn.pasteme.common.vo.ContentVO;

/**
 * Created by 白振宇 on 2019/9/30 00:41
 */
public interface DemoService {
    ContentVO getContentByKey(TokenDTO tokenDTO);
}
