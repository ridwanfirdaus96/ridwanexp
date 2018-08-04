import React, { Component } from "react";
import { View, TextInput, Button, StyleSheet } from "react-native";

import DefaultInput from "../UI/DefaultInput/DefaultInput";

const informationInput = props => (
    <DefaultInput
    placeholder="Information Name"
    value={props.informationData.value}
    valid={props.informationData.valid}
    touched={props.informationData.touched}
    onChangeText={props.onChangeText}
    />
  );

  export default informationInput;
