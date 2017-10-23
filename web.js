import React, { Component } from 'react';
import {
  NativeModules,
  UIManager,
  findNodeHandle,
  requireNativeComponent,
  View,
} from 'react-native';
import PropTypes from 'prop-types';

const { RNX5 } = NativeModules;

const RCT_X5_VIEW_REF = 'RCTX5View';
const iface = {
  name: RCT_X5_VIEW_REF,
  propTypes: {
    ...View.propTypes,
    enableJavaScript: PropTypes.bool,
    enableJavaScriptCanOpenWindowsAutomatically: PropTypes.bool,
    enableWideViewPort: PropTypes.bool,
  },
};

const RCTX5View = requireNativeComponent('RCTX5View', iface);

export default class X5View extends Component {
  static defaultProps = {
    enableJavaScript: false,
    enableJavaScriptCanOpenWindowsAutomatically: false,
    enableWideViewPort: false,
  };

  load(url) {
    UIManager.dispatchViewManagerCommand(
      findNodeHandle(this.refs[RCT_X5_VIEW_REF]),
      UIManager.RCTX5View.Commands.load,
      [url]
    )
  }

  render() {
    const { props } = this;
    return (
      <RCTX5View
        {...props}
        ref={RCT_X5_VIEW_REF}
      />
    );
  }
}
