package fun.topc.seckill.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import fun.topc.seckill.mapper.TUserMapper;
import fun.topc.seckill.pojo.TUser;
import fun.topc.seckill.service.ITUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author eric
 * @since 2023-11-29
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

}
