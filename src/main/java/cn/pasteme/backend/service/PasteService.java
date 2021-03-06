package cn.pasteme.backend.service;

import cn.pasteme.backend.exception.DuplicateException;
import cn.pasteme.backend.exception.ManipulationException;
import cn.pasteme.common.dto.PasteRequestDTO;
import cn.pasteme.common.dto.PasteResponseDTO;
import cn.pasteme.common.utils.result.Response;

/**
 * @author Lucien
 * @version 1.0.2
 */
public interface PasteService {

    /**
     * 通过 key 和 password 得到 DTO
     * 需要判断 key 的类别
     * @param pasteRequestDTO key + password
     * @return DTO
     */
    Response<PasteResponseDTO> get(PasteRequestDTO pasteRequestDTO);

    /**
     * 删除 key 对应的 Paste
     * @param key key
     * @return 成功与否
     */
    Boolean delete(String key);

    /**
     * 创建一个由系统生成 key 的 record
     * @param pasteDTO DTO
     * @return key
     * @throws ManipulationException 创建失败异常
     */
    String createPermanent(PasteRequestDTO pasteDTO) throws ManipulationException;

    /**
     * 创建一个随机/自定义 key 的 Temporary record
     * 如果有 key 则创建自定义，无 key 则创建随机的
     * @param pasteDTO DTO
     * @return key
     * @throws ManipulationException 创建随机 key 失败异常
     * @throws DuplicateException key 重复异常
     */
    String createTemporary(PasteRequestDTO pasteDTO) throws ManipulationException, DuplicateException;
}
