package cn.zhouyafeng.itchat4j.face;

import com.alibaba.fastjson.JSONObject;

/**
 * 消息处理接口
 * @author https://github.com/yaphone
 * @version 1.0
 * @date 创建时间：2017年4月20日 上午12:13:49
 */
public interface IMsgHandlerFace {
  /**
   * @author https://github.com/yaphone
   * @date 2017年4月20日 上午12:15:00
   */
  public String textMsgHandle(JSONObject msg);

  /**
   * 处理图片消息
   * @author https://github.com/yaphone
   * @date 2017年4月21日 下午11:07:06
   */
  public String picMsgHandle(JSONObject msg);

  /**
   * 处理声音消息
   * @author https://github.com/yaphone
   * @date 2017年4月22日 上午12:09:44
   */
  public String voiceMsgHandle(JSONObject msg);

  /**
   * 处理小视频消息
   * @author https://github.com/yaphone
   * @date 2017年4月23日 下午12:19:50
   */
  public String viedoMsgHandle(JSONObject msg);

  /**
   * 处理名片消息
   * @author https://github.com/yaphone
   * @date 2017年5月1日 上午12:50:50
   */
  public String nameCardMsgHandle(JSONObject msg);

  /**
   * 处理系统消息
   * @author Relyn
   * @date 2017年6月21日17:43:51
   */
  public void sysMsgHandle(JSONObject msg);

}
