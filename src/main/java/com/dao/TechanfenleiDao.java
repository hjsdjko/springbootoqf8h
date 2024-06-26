package com.dao;

import com.entity.TechanfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TechanfenleiVO;
import com.entity.view.TechanfenleiView;


/**
 * 特产分类
 * 
 * @author 
 * @email 
 * @date 2022-04-06 15:28:34
 */
public interface TechanfenleiDao extends BaseMapper<TechanfenleiEntity> {
	
	List<TechanfenleiVO> selectListVO(@Param("ew") Wrapper<TechanfenleiEntity> wrapper);
	
	TechanfenleiVO selectVO(@Param("ew") Wrapper<TechanfenleiEntity> wrapper);
	
	List<TechanfenleiView> selectListView(@Param("ew") Wrapper<TechanfenleiEntity> wrapper);

	List<TechanfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<TechanfenleiEntity> wrapper);
	
	TechanfenleiView selectView(@Param("ew") Wrapper<TechanfenleiEntity> wrapper);
	

}
